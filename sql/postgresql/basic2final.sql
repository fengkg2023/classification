--sys_menu  添加了一列is_refresh   并增多了不少系统菜单
--- 备份自己添加的菜单， 重新创建，并把系统自带的重新插入，记得备份的 要在is_refresh 列添加上 '1',
-- ----------------------------
-- 5、菜单权限表
-- ----------------------------
drop table if exists sys_menu;
create table sys_menu (
                          menu_id              BIGSERIAL not null,
                          menu_name            VARCHAR(50)          not null,
                          parent_id            BIGINT                 null default 0,
                          order_num            INT4                 null default NULL,
                          url                  VARCHAR(200)         null default '',
                          target               VARCHAR(20)          null default '',
                          menu_type            CHAR(1)              null default '',
                          visible              CHAR(1)              null default '0',
                          is_refresh           CHAR(1)              null default '1',
                          perms                VARCHAR(100)         null default '',
                          icon                 VARCHAR(100)         null default '',
                          create_by            VARCHAR(64)          null default '',
                          create_time          TIMESTAMP                 null,
                          update_by            VARCHAR(64)          null default '',
                          update_time          TIMESTAMP                 null,
                          remark               VARCHAR(500)         null default '',
                          constraint PK_SYS_MENU primary key (menu_id)
);
alter sequence if exists sys_menu_menu_id_seq restart with 2000 cache 20;

comment on table sys_menu is '菜单权限表';
comment on column sys_menu.menu_id is '菜单ID';
comment on column sys_menu.menu_name is '菜单名称';
comment on column sys_menu.parent_id is '父菜单ID';
comment on column sys_menu.order_num is '显示顺序';
comment on column sys_menu.url is '请求地址';
comment on column sys_menu.target       is '打开方式（menuItem页签 menuBlank新窗口）';
comment on column sys_menu.menu_type is '菜单类型:M目录,C菜单,F按钮';
comment on column sys_menu.visible is '菜单状态:0显示,1隐藏';
comment on column sys_menu.is_refresh is '是否刷新（0刷新 1不刷新）';
comment on column sys_menu.perms is '权限标识';
comment on column sys_menu.icon is '菜单图标';
comment on column sys_menu.create_by is '创建者';
comment on column sys_menu.create_time is '创建时间';
comment on column sys_menu.update_by is '更新者';
comment on column sys_menu.update_time is '更新时间';
comment on column sys_menu.remark is '备注';

-- 一级菜单
insert into sys_menu values('1', '系统管理', '0', '1', '#',                '',          'M', '0', '1', '', 'fa fa-gear',           'admin', now(), '', null, '系统管理目录');
insert into sys_menu values('2', '系统监控', '0', '2', '#',                '',          'M', '0', '1', '', 'fa fa-video-camera',   'admin', now(), '', null, '系统监控目录');
insert into sys_menu values('3', '系统工具', '0', '3', '#',                '',          'M', '0', '1', '', 'fa fa-bars',           'admin', now(), '', null, '系统工具目录');
insert into sys_menu values('4', '若依官网', '0', '4', 'http://classification.vip', 'menuBlank', 'C', '0', '1', '', 'fa fa-location-arrow', 'admin', now(), '', null, '若依官网地址');
-- 二级菜单
insert into sys_menu values('100',  '用户管理', '1', '1', '/system/user',          '', 'C', '0', '1', 'system:user:view',         'fa fa-user-o',          'admin', now(), '', null, '用户管理菜单');
insert into sys_menu values('101',  '角色管理', '1', '2', '/system/role',          '', 'C', '0', '1', 'system:role:view',         'fa fa-user-secret',     'admin', now(), '', null, '角色管理菜单');
insert into sys_menu values('102',  '菜单管理', '1', '3', '/system/menu',          '', 'C', '0', '1', 'system:menu:view',         'fa fa-th-list',         'admin', now(), '', null, '菜单管理菜单');
insert into sys_menu values('103',  '部门管理', '1', '4', '/system/dept',          '', 'C', '0', '1', 'system:dept:view',         'fa fa-outdent',         'admin', now(), '', null, '部门管理菜单');
insert into sys_menu values('104',  '岗位管理', '1', '5', '/system/post',          '', 'C', '0', '1', 'system:post:view',         'fa fa-address-card-o',  'admin', now(), '', null, '岗位管理菜单');
insert into sys_menu values('105',  '字典管理', '1', '6', '/system/dict',          '', 'C', '0', '1', 'system:dict:view',         'fa fa-bookmark-o',      'admin', now(), '', null, '字典管理菜单');
insert into sys_menu values('106',  '参数设置', '1', '7', '/system/config',        '', 'C', '0', '1', 'system:config:view',       'fa fa-sun-o',           'admin', now(), '', null, '参数设置菜单');
insert into sys_menu values('107',  '通知公告', '1', '8', '/system/notice',        '', 'C', '0', '1', 'system:notice:view',       'fa fa-bullhorn',        'admin', now(), '', null, '通知公告菜单');
insert into sys_menu values('108',  '日志管理', '1', '9', '#',                     '', 'M', '0', '1', '',                         'fa fa-pencil-square-o', 'admin', now(), '', null, '日志管理菜单');
insert into sys_menu values('109',  '在线用户', '2', '1', '/monitor/online',       '', 'C', '0', '1', 'monitor:online:view',      'fa fa-user-circle',     'admin', now(), '', null, '在线用户菜单');
insert into sys_menu values('110',  '定时任务', '2', '2', '/monitor/job',          '', 'C', '0', '1', 'monitor:job:view',         'fa fa-tasks',           'admin', now(), '', null, '定时任务菜单');
insert into sys_menu values('111',  '数据监控', '2', '3', '/monitor/data',         '', 'C', '0', '1', 'monitor:data:view',        'fa fa-bug',             'admin', now(), '', null, '数据监控菜单');
insert into sys_menu values('112',  '服务监控', '2', '4', '/monitor/server',       '', 'C', '0', '1', 'monitor:server:view',      'fa fa-server',          'admin', now(), '', null, '服务监控菜单');
insert into sys_menu values('113',  '缓存监控', '2', '5', '/monitor/cache',        '', 'C', '0', '1', 'monitor:cache:view',       'fa fa-cube',            'admin', now(), '', null, '缓存监控菜单');
insert into sys_menu values('114',  '表单构建', '3', '1', '/tool/build',           '', 'C', '0', '1', 'tool:build:view',          'fa fa-wpforms',         'admin', now(), '', null, '表单构建菜单');
insert into sys_menu values('115',  '代码生成', '3', '2', '/tool/gen',             '', 'C', '0', '1', 'tool:gen:view',            'fa fa-code',            'admin', now(), '', null, '代码生成菜单');
insert into sys_menu values('116',  '系统接口', '3', '3', '/tool/swagger',         '', 'C', '0', '1', 'tool:swagger:view',        'fa fa-gg',              'admin', now(), '', null, '系统接口菜单');
-- 三级菜单
insert into sys_menu values('500',  '操作日志', '108', '1', '/monitor/operlog',    '', 'C', '0', '1', 'monitor:operlog:view',     'fa fa-address-book',    'admin', now(), '', null, '操作日志菜单');
insert into sys_menu values('501',  '登录日志', '108', '2', '/monitor/logininfor', '', 'C', '0', '1', 'monitor:logininfor:view',  'fa fa-file-image-o',    'admin', now(), '', null, '登录日志菜单');
-- 用户管理按钮
insert into sys_menu values('1000', '用户查询', '100', '1',  '#', '',  'F', '0', '1', 'system:user:list',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1001', '用户新增', '100', '2',  '#', '',  'F', '0', '1', 'system:user:add',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1002', '用户修改', '100', '3',  '#', '',  'F', '0', '1', 'system:user:edit',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1003', '用户删除', '100', '4',  '#', '',  'F', '0', '1', 'system:user:remove',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1004', '用户导出', '100', '5',  '#', '',  'F', '0', '1', 'system:user:export',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1005', '用户导入', '100', '6',  '#', '',  'F', '0', '1', 'system:user:import',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1006', '重置密码', '100', '7',  '#', '',  'F', '0', '1', 'system:user:resetPwd',    '#', 'admin', now(), '', null, '');
-- 角色管理按钮
insert into sys_menu values('1007', '角色查询', '101', '1',  '#', '',  'F', '0', '1', 'system:role:list',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1008', '角色新增', '101', '2',  '#', '',  'F', '0', '1', 'system:role:add',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1009', '角色修改', '101', '3',  '#', '',  'F', '0', '1', 'system:role:edit',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1010', '角色删除', '101', '4',  '#', '',  'F', '0', '1', 'system:role:remove',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1011', '角色导出', '101', '5',  '#', '',  'F', '0', '1', 'system:role:export',      '#', 'admin', now(), '', null, '');
-- 菜单管理按钮
insert into sys_menu values('1012', '菜单查询', '102', '1',  '#', '',  'F', '0', '1', 'system:menu:list',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1013', '菜单新增', '102', '2',  '#', '',  'F', '0', '1', 'system:menu:add',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1014', '菜单修改', '102', '3',  '#', '',  'F', '0', '1', 'system:menu:edit',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1015', '菜单删除', '102', '4',  '#', '',  'F', '0', '1', 'system:menu:remove',      '#', 'admin', now(), '', null, '');
-- 部门管理按钮
insert into sys_menu values('1016', '部门查询', '103', '1',  '#', '',  'F', '0', '1', 'system:dept:list',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1017', '部门新增', '103', '2',  '#', '',  'F', '0', '1', 'system:dept:add',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1018', '部门修改', '103', '3',  '#', '',  'F', '0', '1', 'system:dept:edit',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1019', '部门删除', '103', '4',  '#', '',  'F', '0', '1', 'system:dept:remove',      '#', 'admin', now(), '', null, '');
-- 岗位管理按钮
insert into sys_menu values('1020', '岗位查询', '104', '1',  '#', '',  'F', '0', '1', 'system:post:list',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1021', '岗位新增', '104', '2',  '#', '',  'F', '0', '1', 'system:post:add',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1022', '岗位修改', '104', '3',  '#', '',  'F', '0', '1', 'system:post:edit',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1023', '岗位删除', '104', '4',  '#', '',  'F', '0', '1', 'system:post:remove',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1024', '岗位导出', '104', '5',  '#', '',  'F', '0', '1', 'system:post:export',      '#', 'admin', now(), '', null, '');
-- 字典管理按钮
insert into sys_menu values('1025', '字典查询', '105', '1', '#', '',  'F', '0', '1', 'system:dict:list',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1026', '字典新增', '105', '2', '#', '',  'F', '0', '1', 'system:dict:add',          '#', 'admin', now(), '', null, '');
insert into sys_menu values('1027', '字典修改', '105', '3', '#', '',  'F', '0', '1', 'system:dict:edit',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1028', '字典删除', '105', '4', '#', '',  'F', '0', '1', 'system:dict:remove',       '#', 'admin', now(), '', null, '');
insert into sys_menu values('1029', '字典导出', '105', '5', '#', '',  'F', '0', '1', 'system:dict:export',       '#', 'admin', now(), '', null, '');
-- 参数设置按钮
insert into sys_menu values('1030', '参数查询', '106', '1', '#', '',  'F', '0', '1', 'system:config:list',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1031', '参数新增', '106', '2', '#', '',  'F', '0', '1', 'system:config:add',       '#', 'admin', now(), '', null, '');
insert into sys_menu values('1032', '参数修改', '106', '3', '#', '',  'F', '0', '1', 'system:config:edit',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1033', '参数删除', '106', '4', '#', '',  'F', '0', '1', 'system:config:remove',    '#', 'admin', now(), '', null, '');
insert into sys_menu values('1034', '参数导出', '106', '5', '#', '',  'F', '0', '1', 'system:config:export',    '#', 'admin', now(), '', null, '');
-- 通知公告按钮
insert into sys_menu values('1035', '公告查询', '107', '1', '#', '',  'F', '0', '1', 'system:notice:list',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1036', '公告新增', '107', '2', '#', '',  'F', '0', '1', 'system:notice:add',       '#', 'admin', now(), '', null, '');
insert into sys_menu values('1037', '公告修改', '107', '3', '#', '',  'F', '0', '1', 'system:notice:edit',      '#', 'admin', now(), '', null, '');
insert into sys_menu values('1038', '公告删除', '107', '4', '#', '',  'F', '0', '1', 'system:notice:remove',    '#', 'admin', now(), '', null, '');
-- 操作日志按钮
insert into sys_menu values('1039', '操作查询', '500', '1', '#', '',  'F', '0', '1', 'monitor:operlog:list',    '#', 'admin', now(), '', null, '');
insert into sys_menu values('1040', '操作删除', '500', '2', '#', '',  'F', '0', '1', 'monitor:operlog:remove',  '#', 'admin', now(), '', null, '');
insert into sys_menu values('1041', '详细信息', '500', '3', '#', '',  'F', '0', '1', 'monitor:operlog:detail',  '#', 'admin', now(), '', null, '');
insert into sys_menu values('1042', '日志导出', '500', '4', '#', '',  'F', '0', '1', 'monitor:operlog:export',  '#', 'admin', now(), '', null, '');
-- 登录日志按钮
insert into sys_menu values('1043', '登录查询', '501', '1', '#', '',  'F', '0', '1', 'monitor:logininfor:list',         '#', 'admin', now(), '', null, '');
insert into sys_menu values('1044', '登录删除', '501', '2', '#', '',  'F', '0', '1', 'monitor:logininfor:remove',       '#', 'admin', now(), '', null, '');
insert into sys_menu values('1045', '日志导出', '501', '3', '#', '',  'F', '0', '1', 'monitor:logininfor:export',       '#', 'admin', now(), '', null, '');
insert into sys_menu values('1046', '账户解锁', '501', '4', '#', '',  'F', '0', '1', 'monitor:logininfor:unlock',       '#', 'admin', now(), '', null, '');
-- 在线用户按钮
insert into sys_menu values('1047', '在线查询', '109', '1', '#', '',  'F', '0', '1', 'monitor:online:list',             '#', 'admin', now(), '', null, '');
insert into sys_menu values('1048', '批量强退', '109', '2', '#', '',  'F', '0', '1', 'monitor:online:batchForceLogout', '#', 'admin', now(), '', null, '');
insert into sys_menu values('1049', '单条强退', '109', '3', '#', '',  'F', '0', '1', 'monitor:online:forceLogout',      '#', 'admin', now(), '', null, '');
-- 定时任务按钮
insert into sys_menu values('1050', '任务查询', '110', '1', '#', '',  'F', '0', '1', 'monitor:job:list',                '#', 'admin', now(), '', null, '');
insert into sys_menu values('1051', '任务新增', '110', '2', '#', '',  'F', '0', '1', 'monitor:job:add',                 '#', 'admin', now(), '', null, '');
insert into sys_menu values('1052', '任务修改', '110', '3', '#', '',  'F', '0', '1', 'monitor:job:edit',                '#', 'admin', now(), '', null, '');
insert into sys_menu values('1053', '任务删除', '110', '4', '#', '',  'F', '0', '1', 'monitor:job:remove',              '#', 'admin', now(), '', null, '');
insert into sys_menu values('1054', '状态修改', '110', '5', '#', '',  'F', '0', '1', 'monitor:job:changeStatus',        '#', 'admin', now(), '', null, '');
insert into sys_menu values('1055', '任务详细', '110', '6', '#', '',  'F', '0', '1', 'monitor:job:detail',              '#', 'admin', now(), '', null, '');
insert into sys_menu values('1056', '任务导出', '110', '7', '#', '',  'F', '0', '1', 'monitor:job:export',              '#', 'admin', now(), '', null, '');
-- 代码生成按钮
insert into sys_menu values('1057', '生成查询', '115', '1', '#', '',  'F', '0', '1', 'tool:gen:list',     '#', 'admin', now(), '', null, '');
insert into sys_menu values('1058', '生成修改', '115', '2', '#', '',  'F', '0', '1', 'tool:gen:edit',     '#', 'admin', now(), '', null, '');
insert into sys_menu values('1059', '生成删除', '115', '3', '#', '',  'F', '0', '1', 'tool:gen:remove',   '#', 'admin', now(), '', null, '');
insert into sys_menu values('1060', '预览代码', '115', '4', '#', '',  'F', '0', '1', 'tool:gen:preview',  '#', 'admin', now(), '', null, '');
insert into sys_menu values('1061', '生成代码', '115', '5', '#', '',  'F', '0', '1', 'tool:gen:code',     '#', 'admin', now(), '', null, '');


insert into sys_role_menu values ('2', '116');

---- sys_config 更新三条
delete from sys_config where config_id in (4,9,10);
insert into sys_config values(4, '账号自助-是否开启用户注册功能', 'sys.account.registerUser', 'false',         'Y', 'admin', now(), '', null, '是否开启注册用户功能（true开启，false关闭）');
insert into sys_config values(9, '主框架页-是否开启页脚',         'sys.index.footer',           'true',          'Y', 'admin', now(), '', null, '是否开启底部页脚显示（true显示，false隐藏）');
insert into sys_config values(10, '主框架页-是否开启页签',         'sys.index.tagsView',               'true',          'Y', 'admin', now(), '', null, '是否开启菜单多页签显示（true显示，false隐藏）');
