-- The custom functions here
INSERT INTO auth_menu (code,name,parent_code, sort_index, function_code,icon, url, params) VALUES ('MN_BUSSINESS_MNG','业务类管理',NULL,30000,'MN_BUSSINESS_MNG',NULL,'/bussiness',NULL);
INSERT INTO auth_menu (code,name,parent_code, sort_index, function_code,icon, url, params) VALUES ('MN_GAILUN_MNG','业务大盖伦管理','MN_BUSSINESS_MNG',31000,'MN_GAILUN_MNG',NULL,'/gailun','views/gailun/index');
INSERT INTO auth_menu (code,name,parent_code, sort_index, function_code,icon, url, params) VALUES ('MN_LKSS_MNG','业务洛克萨斯管理','MN_BUSSINESS_MNG',32000,'MN_LKSS_MNG',NULL,'/lkss','views/lkss/index');
INSERT INTO auth_menu (code,name,parent_code, sort_index, function_code,icon, url, params) VALUES ('MN_AIOUNIYA_MNG','业务艾欧尼亚管理','MN_BUSSINESS_MNG',33000,'MN_AIOUNIYA_MNG',NULL,'/aiouniya','views/aiouniya/index');