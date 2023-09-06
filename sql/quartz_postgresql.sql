-- ----------------------------
-- 1、存储每一个已配置的 jobDetail 的详细信息
-- ----------------------------
drop table if exists qrtz_job_details;
CREATE TABLE qrtz_job_details
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    JOB_NAME  VARCHAR(200) NOT NULL,
    JOB_GROUP VARCHAR(200) NOT NULL,
    DESCRIPTION VARCHAR(250) NULL,
    JOB_CLASS_NAME   VARCHAR(250) NOT NULL,
    IS_DURABLE BOOL NOT NULL,
    IS_NONCONCURRENT BOOL NOT NULL,
    IS_UPDATE_DATA BOOL NOT NULL,
    REQUESTS_RECOVERY BOOL NOT NULL,
    JOB_DATA BYTEA NULL,
    PRIMARY KEY (SCHED_NAME,JOB_NAME,JOB_GROUP)
);

COMMENT ON TABLE qrtz_job_details    IS '任务详细信息表';
COMMENT ON COLUMN qrtz_job_details.SCHED_NAME     IS '调度名称';
COMMENT ON COLUMN qrtz_job_details.JOB_NAME  IS '任务名称';
COMMENT ON COLUMN qrtz_job_details.JOB_GROUP IS '任务组名';
COMMENT ON COLUMN qrtz_job_details.DESCRIPTION IS '相关介绍';
COMMENT ON COLUMN qrtz_job_details.JOB_CLASS_NAME  IS '执行任务类名称';
COMMENT ON COLUMN qrtz_job_details.IS_DURABLE IS '是否持久化';
COMMENT ON COLUMN qrtz_job_details.IS_NONCONCURRENT IS '是否并发';
COMMENT ON COLUMN qrtz_job_details.IS_UPDATE_DATA IS '是否更新数据';
COMMENT ON COLUMN qrtz_job_details.REQUESTS_RECOVERY IS '是否接受恢复执行';
COMMENT ON COLUMN qrtz_job_details.JOB_DATA IS '存放持久化job对象';
-- ----------------------------
-- 2、 存储已配置的 Trigger 的信息
-- ----------------------------
drop table if exists qrtz_triggers;
CREATE TABLE qrtz_triggers
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    TRIGGER_NAME VARCHAR(200) NOT NULL,
    TRIGGER_GROUP VARCHAR(200) NOT NULL,
    JOB_NAME  VARCHAR(200) NOT NULL,
    JOB_GROUP VARCHAR(200) NOT NULL,
    DESCRIPTION VARCHAR(250) NULL,
    NEXT_FIRE_TIME BIGINT NULL,
    PREV_FIRE_TIME BIGINT NULL,
    PRIORITY INTEGER NULL,
    TRIGGER_STATE VARCHAR(16) NOT NULL,
    TRIGGER_TYPE VARCHAR(8) NOT NULL,
    START_TIME BIGINT NOT NULL,
    END_TIME BIGINT NULL,
    CALENDAR_NAME VARCHAR(200) NULL,
    MISFIRE_INSTR SMALLINT NULL,
    JOB_DATA BYTEA NULL,
    PRIMARY KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (SCHED_NAME,JOB_NAME,JOB_GROUP)
	REFERENCES QRTZ_JOB_DETAILS(SCHED_NAME,JOB_NAME,JOB_GROUP)
);
COMMENT ON TABLE qrtz_triggers    IS '触发器详细信息表';
COMMENT ON COLUMN  qrtz_triggers.SCHED_NAME       IS '调度名称';
COMMENT ON COLUMN  qrtz_triggers.TRIGGER_NAME     IS '触发器的名字';
COMMENT ON COLUMN  qrtz_triggers.TRIGGER_GROUP    IS '触发器所属组的名字';
COMMENT ON COLUMN  qrtz_triggers.JOB_NAME         IS 'qrtz_job_details表job_name的外键';
COMMENT ON COLUMN  qrtz_triggers.JOB_GROUP        IS 'qrtz_job_details表job_group的外键';
COMMENT ON COLUMN  qrtz_triggers.DESCRIPTION      IS '相关介绍';
COMMENT ON COLUMN  qrtz_triggers.NEXT_FIRE_TIME   IS '上一次触发时间（毫秒）';
COMMENT ON COLUMN  qrtz_triggers.PREV_FIRE_TIME   IS '下一次触发时间（默认为-1表示不触发）';
COMMENT ON COLUMN  qrtz_triggers.PRIORITY         IS '优先级';
COMMENT ON COLUMN  qrtz_triggers.TRIGGER_STATE    IS '触发器状态';
COMMENT ON COLUMN  qrtz_triggers.TRIGGER_TYPE     IS '触发器的类型';
COMMENT ON COLUMN  qrtz_triggers.START_TIME       IS '开始时间';
COMMENT ON COLUMN  qrtz_triggers.END_TIME         IS '结束时间';
COMMENT ON COLUMN  qrtz_triggers.CALENDAR_NAME    IS '日程表名称';
COMMENT ON COLUMN  qrtz_triggers.MISFIRE_INSTR    IS '补偿执行的策略';
COMMENT ON COLUMN  qrtz_triggers.JOB_DATA         IS '存放持久化job对象';
-- ----------------------------
-- 3、 存储简单的 Trigger，包括重复次数，间隔，以及已触发的次数
-- ----------------------------
drop table if exists qrtz_simple_triggers;
CREATE TABLE qrtz_simple_triggers
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    TRIGGER_NAME VARCHAR(200) NOT NULL,
    TRIGGER_GROUP VARCHAR(200) NOT NULL,
    REPEAT_COUNT BIGINT NOT NULL,
    REPEAT_INTERVAL BIGINT NOT NULL,
    TIMES_TRIGGERED BIGINT NOT NULL,
    PRIMARY KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
	REFERENCES QRTZ_TRIGGERS(SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
);
COMMENT ON TABLE qrtz_simple_triggers    IS '简单触发器的信息表';
COMMENT ON COLUMN  qrtz_simple_triggers.SCHED_NAME        IS '调度名称';
COMMENT ON COLUMN  qrtz_simple_triggers.TRIGGER_NAME      IS 'qrtz_triggers表trigger_name的外键';
COMMENT ON COLUMN  qrtz_simple_triggers.TRIGGER_GROUP     IS 'qrtz_triggers表trigger_group的外键';
COMMENT ON COLUMN  qrtz_simple_triggers.REPEAT_COUNT      IS '重复的次数统计';
COMMENT ON COLUMN  qrtz_simple_triggers.REPEAT_INTERVAL   IS '重复的间隔时间';
COMMENT ON COLUMN  qrtz_simple_triggers.TIMES_TRIGGERED   IS '已经触发的次数';
-- ----------------------------
-- 4、 存储 Cron Trigger，包括 Cron 表达式和时区信息
-- ----------------------------
drop table if exists qrtz_cron_triggers;
CREATE TABLE qrtz_cron_triggers
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    TRIGGER_NAME VARCHAR(200) NOT NULL,
    TRIGGER_GROUP VARCHAR(200) NOT NULL,
    CRON_EXPRESSION VARCHAR(120) NOT NULL,
    TIME_ZONE_ID VARCHAR(80),
    PRIMARY KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
	REFERENCES QRTZ_TRIGGERS(SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
);
COMMENT ON TABLE qrtz_cron_triggers    IS 'Cron类型的触发器表';
COMMENT ON COLUMN  qrtz_cron_triggers.SCHED_NAME         IS '调度名称';
COMMENT ON COLUMN  qrtz_cron_triggers.TRIGGER_NAME       IS 'qrtz_triggers表trigger_name的外键';
COMMENT ON COLUMN  qrtz_cron_triggers.TRIGGER_GROUP      IS 'qrtz_triggers表trigger_group的外键';
COMMENT ON COLUMN  qrtz_cron_triggers.CRON_EXPRESSION    IS 'cron表达式';
COMMENT ON COLUMN  qrtz_cron_triggers.TIME_ZONE_ID       IS '时区';
-- ----------------------------
-- 5、 Trigger 作为 Blob 类型存储(用于 Quartz 用户用 JDBC 创建他们自己定制的 Trigger 类型，JobStore 并不知道如何存储实例的时候)
-- ----------------------------
drop table if exists qrtz_blob_triggers;
CREATE TABLE qrtz_blob_triggers
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    TRIGGER_NAME VARCHAR(200) NOT NULL,
    TRIGGER_GROUP VARCHAR(200) NOT NULL,
    BLOB_DATA BYTEA NULL,
    PRIMARY KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
        REFERENCES QRTZ_TRIGGERS(SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
);
COMMENT ON TABLE qrtz_blob_triggers    IS 'Blob类型的触发器表';
COMMENT ON COLUMN  qrtz_blob_triggers.SCHED_NAME       IS '调度名称';
COMMENT ON COLUMN  qrtz_blob_triggers.TRIGGER_NAME     IS 'qrtz_triggers表trigger_name的外键';
COMMENT ON COLUMN  qrtz_blob_triggers.TRIGGER_GROUP    IS 'qrtz_triggers表trigger_group的外键';
COMMENT ON COLUMN  qrtz_blob_triggers.BLOB_DATA        IS '存放持久化Trigger对象';
-- ----------------------------
-- 6、 以 Blob 类型存储存放日历信息， quartz可配置一个日历来指定一个时间范围
-- ----------------------------
drop table if exists qrtz_calendars;
CREATE TABLE qrtz_calendars
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    CALENDAR_NAME  VARCHAR(200) NOT NULL,
    CALENDAR BYTEA NOT NULL,
    PRIMARY KEY (SCHED_NAME,CALENDAR_NAME)
);
COMMENT ON TABLE qrtz_calendars    IS '日历信息表';
COMMENT ON COLUMN  qrtz_calendars.SCHED_NAME    IS '调度名称';
COMMENT ON COLUMN  qrtz_calendars.CALENDAR_NAME IS '日历名称';
COMMENT ON COLUMN  qrtz_calendars.CALENDAR      IS '存放持久化calendar对象';
-- ----------------------------
-- 7、 存储已暂停的 Trigger 组的信息
-- ----------------------------
drop table if exists qrtz_paused_trigger_grps;
CREATE TABLE qrtz_paused_trigger_grps
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    TRIGGER_GROUP  VARCHAR(200) NOT NULL,
    PRIMARY KEY (SCHED_NAME,TRIGGER_GROUP)
);
COMMENT ON TABLE qrtz_paused_trigger_grps    IS '暂停的触发器表';
COMMENT ON COLUMN  qrtz_paused_trigger_grps.SCHED_NAME      IS '调度名称';
COMMENT ON COLUMN  qrtz_paused_trigger_grps.TRIGGER_GROUP   IS 'qrtz_triggers表trigger_group的外键';
-- ----------------------------
-- 8、 存储与已触发的 Trigger 相关的状态信息，以及相联 Job 的执行信息
-- ----------------------------
drop table if exists qrtz_fired_triggers;
CREATE TABLE qrtz_fired_triggers
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    ENTRY_ID VARCHAR(95) NOT NULL,
    TRIGGER_NAME VARCHAR(200) NOT NULL,
    TRIGGER_GROUP VARCHAR(200) NOT NULL,
    INSTANCE_NAME VARCHAR(200) NOT NULL,
    FIRED_TIME BIGINT NOT NULL,
    SCHED_TIME BIGINT NOT NULL,
    PRIORITY INTEGER NOT NULL,
    STATE VARCHAR(16) NOT NULL,
    JOB_NAME VARCHAR(200) NULL,
    JOB_GROUP VARCHAR(200) NULL,
    IS_NONCONCURRENT BOOL NULL,
    REQUESTS_RECOVERY BOOL NULL,
    PRIMARY KEY (SCHED_NAME,ENTRY_ID)
);
COMMENT ON TABLE qrtz_fired_triggers    IS '已触发的触发器表';
COMMENT ON COLUMN  qrtz_fired_triggers.SCHED_NAME        IS '调度名称';
COMMENT ON COLUMN  qrtz_fired_triggers.ENTRY_ID          IS '调度器实例id';
COMMENT ON COLUMN  qrtz_fired_triggers.TRIGGER_NAME      IS 'qrtz_triggers表trigger_name的外键';
COMMENT ON COLUMN  qrtz_fired_triggers.TRIGGER_GROUP     IS 'qrtz_triggers表trigger_group的外键';
COMMENT ON COLUMN  qrtz_fired_triggers.INSTANCE_NAME     IS '调度器实例名';
COMMENT ON COLUMN  qrtz_fired_triggers.FIRED_TIME        IS '触发的时间';
COMMENT ON COLUMN  qrtz_fired_triggers.SCHED_TIME        IS '定时器制定的时间';
COMMENT ON COLUMN  qrtz_fired_triggers.PRIORITY          IS '优先级';
COMMENT ON COLUMN  qrtz_fired_triggers.STATE             IS '状态';
COMMENT ON COLUMN  qrtz_fired_triggers.JOB_NAME          IS '任务名称';
COMMENT ON COLUMN  qrtz_fired_triggers.JOB_GROUP         IS '任务组名';
COMMENT ON COLUMN  qrtz_fired_triggers.IS_NONCONCURRENT  IS '是否并发';
COMMENT ON COLUMN  qrtz_fired_triggers.REQUESTS_RECOVERY IS '是否接受恢复执行';
-- ----------------------------
-- 9、 存储少量的有关 Scheduler 的状态信息，假如是用于集群中，可以看到其他的 Scheduler 实例
-- ----------------------------
drop table if exists qrtz_scheduler_state;
CREATE TABLE qrtz_scheduler_state
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    INSTANCE_NAME VARCHAR(200) NOT NULL,
    LAST_CHECKIN_TIME BIGINT NOT NULL,
    CHECKIN_INTERVAL BIGINT NOT NULL,
    PRIMARY KEY (SCHED_NAME,INSTANCE_NAME)
);
COMMENT ON TABLE qrtz_scheduler_state    IS '调度器状态表';
COMMENT ON COLUMN  qrtz_scheduler_state.SCHED_NAME         IS '调度名称';
COMMENT ON COLUMN  qrtz_scheduler_state.INSTANCE_NAME      IS '实例名称';
COMMENT ON COLUMN  qrtz_scheduler_state.LAST_CHECKIN_TIME  IS '上次检查时间';
COMMENT ON COLUMN  qrtz_scheduler_state.CHECKIN_INTERVAL   IS '检查间隔时间';

-- ----------------------------
-- 10、 存储程序的悲观锁的信息(假如使用了悲观锁)
-- ----------------------------
drop table if exists qrtz_locks;
CREATE TABLE qrtz_locks
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    LOCK_NAME  VARCHAR(40) NOT NULL,
    PRIMARY KEY (SCHED_NAME,LOCK_NAME)
);
COMMENT ON TABLE qrtz_locks    IS '存储的悲观锁信息表';
COMMENT ON COLUMN  qrtz_locks.SCHED_NAME   IS '调度名称';
COMMENT ON COLUMN  qrtz_locks.LOCK_NAME    IS '悲观锁名称';
-- ----------------------------
-- 11、 Quartz集群实现同步机制的行锁表
-- ---------------------------- 

drop table if exists qrtz_simprop_triggers;
CREATE TABLE qrtz_simprop_triggers
  (
    SCHED_NAME VARCHAR(120) NOT NULL,
    TRIGGER_NAME VARCHAR(200) NOT NULL,
    TRIGGER_GROUP VARCHAR(200) NOT NULL,
    STR_PROP_1 VARCHAR(512) NULL,
    STR_PROP_2 VARCHAR(512) NULL,
    STR_PROP_3 VARCHAR(512) NULL,
    INT_PROP_1 INT NULL,
    INT_PROP_2 INT NULL,
    LONG_PROP_1 BIGINT NULL,
    LONG_PROP_2 BIGINT NULL,
    DEC_PROP_1 NUMERIC(13,4) NULL,
    DEC_PROP_2 NUMERIC(13,4) NULL,
    BOOL_PROP_1 BOOL NULL,
    BOOL_PROP_2 BOOL NULL,
    PRIMARY KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP),
    FOREIGN KEY (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
    REFERENCES QRTZ_TRIGGERS(SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP)
);
COMMENT ON TABLE qrtz_simprop_triggers    IS '同步机制的行锁表';
COMMENT ON COLUMN  qrtz_simprop_triggers.SCHED_NAME    IS '调度名称';
COMMENT ON COLUMN  qrtz_simprop_triggers.TRIGGER_NAME  IS 'qrtz_triggers表trigger_name的外键';
COMMENT ON COLUMN  qrtz_simprop_triggers.TRIGGER_GROUP IS 'qrtz_triggers表trigger_group的外键';
COMMENT ON COLUMN  qrtz_simprop_triggers.STR_PROP_1    IS 'String类型的trigger的第一个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.STR_PROP_2    IS 'String类型的trigger的第二个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.STR_PROP_3    IS 'String类型的trigger的第三个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.INT_PROP_1    IS 'int类型的trigger的第一个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.INT_PROP_2    IS 'int类型的trigger的第二个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.LONG_PROP_1   IS 'long类型的trigger的第一个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.LONG_PROP_2   IS 'long类型的trigger的第二个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.DEC_PROP_1    IS 'decimal类型的trigger的第一个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.DEC_PROP_2    IS 'decimal类型的trigger的第二个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.BOOL_PROP_1   IS 'Boolean类型的trigger的第一个参数';
COMMENT ON COLUMN  qrtz_simprop_triggers.BOOL_PROP_2   IS 'Boolean类型的trigger的第二个参数';

create index idx_qrtz_j_req_recovery on qrtz_job_details(SCHED_NAME,REQUESTS_RECOVERY);
create index idx_qrtz_j_grp on qrtz_job_details(SCHED_NAME,JOB_GROUP);

create index idx_qrtz_t_j on qrtz_triggers(SCHED_NAME,JOB_NAME,JOB_GROUP);
create index idx_qrtz_t_jg on qrtz_triggers(SCHED_NAME,JOB_GROUP);
create index idx_qrtz_t_c on qrtz_triggers(SCHED_NAME,CALENDAR_NAME);
create index idx_qrtz_t_g on qrtz_triggers(SCHED_NAME,TRIGGER_GROUP);
create index idx_qrtz_t_state on qrtz_triggers(SCHED_NAME,TRIGGER_STATE);
create index idx_qrtz_t_n_state on qrtz_triggers(SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,TRIGGER_STATE);
create index idx_qrtz_t_n_g_state on qrtz_triggers(SCHED_NAME,TRIGGER_GROUP,TRIGGER_STATE);
create index idx_qrtz_t_next_fire_time on qrtz_triggers(SCHED_NAME,NEXT_FIRE_TIME);
create index idx_qrtz_t_nft_st on qrtz_triggers(SCHED_NAME,TRIGGER_STATE,NEXT_FIRE_TIME);
create index idx_qrtz_t_nft_misfire on qrtz_triggers(SCHED_NAME,MISFIRE_INSTR,NEXT_FIRE_TIME);
create index idx_qrtz_t_nft_st_misfire on qrtz_triggers(SCHED_NAME,MISFIRE_INSTR,NEXT_FIRE_TIME,TRIGGER_STATE);
create index idx_qrtz_t_nft_st_misfire_grp on qrtz_triggers(SCHED_NAME,MISFIRE_INSTR,NEXT_FIRE_TIME,TRIGGER_GROUP,TRIGGER_STATE);

create index idx_qrtz_ft_trig_inst_name on qrtz_fired_triggers(SCHED_NAME,INSTANCE_NAME);
create index idx_qrtz_ft_inst_job_req_rcvry on qrtz_fired_triggers(SCHED_NAME,INSTANCE_NAME,REQUESTS_RECOVERY);
create index idx_qrtz_ft_j_g on qrtz_fired_triggers(SCHED_NAME,JOB_NAME,JOB_GROUP);
create index idx_qrtz_ft_jg on qrtz_fired_triggers(SCHED_NAME,JOB_GROUP);
create index idx_qrtz_ft_t_g on qrtz_fired_triggers(SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP);
create index idx_qrtz_ft_tg on qrtz_fired_triggers(SCHED_NAME,TRIGGER_GROUP);
commit;