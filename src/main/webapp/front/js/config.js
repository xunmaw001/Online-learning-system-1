
var projectName = '在线学习系统系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '考试记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '课程信息',
	url: './pages/kechengxinxi/list.html'
}, 
{
	name: '付费资料',
	url: './pages/fufeiziliao/list.html'
}, 
{
	name: '积分商品',
	url: './pages/jifenshangpin/list.html'
}, 

{
	name: '解疑论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '试卷列表',
	url: './pages/exampaper/list.html'
}, 
{
	name: '系统公告',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssml4g8w/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","学生积分"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程分类","menuJump":"列表","tableName":"kechengfenlei"}],"menu":"课程分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","付费资料"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"buttons":["查看","修改","删除","查看评论","购买"],"menu":"付费资料","menuJump":"列表","tableName":"fufeiziliao"}],"menu":"付费资料管理"},{"child":[{"buttons":["查看","修改","删除","审核","资料发送"],"menu":"资料购买","menuJump":"列表","tableName":"ziliaogoumai"}],"menu":"资料购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"资料发送","menuJump":"列表","tableName":"ziliaofasong"}],"menu":"资料发送管理"},{"child":[{"buttons":["查看","修改","删除","增加","扣减"],"menu":"学生积分","menuJump":"列表","tableName":"xueshengjifen"}],"menu":"学生积分管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生积分增加","menuJump":"列表","tableName":"xueshengjifenzengjia"}],"menu":"学生积分增加管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生积分扣减","menuJump":"列表","tableName":"xueshengjifenkoujian"}],"menu":"学生积分扣减管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"buttons":["查看","修改","删除","查看评论","新增"],"menu":"积分商品","menuJump":"列表","tableName":"jifenshangpin"}],"menu":"积分商品管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"积分兑换","menuJump":"列表","tableName":"jifenduihuan"}],"menu":"积分兑换管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷管理","tableName":"exampaper"}],"menu":"试卷管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"解疑论坛","tableName":"forum"}],"menu":"解疑论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["查看","删除"],"menu":"考试记录","tableName":"examrecord"},{"buttons":["查看"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["新增","查看","修改","删除"],"menu":"试卷列表","tableName":"exampaperlist"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","购买"],"menu":"付费资料列表","menuJump":"列表","tableName":"fufeiziliao"}],"menu":"付费资料模块"},{"child":[{"buttons":["查看","兑换"],"menu":"积分商品列表","menuJump":"列表","tableName":"jifenshangpin"}],"menu":"积分商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","支付"],"menu":"资料购买","menuJump":"列表","tableName":"ziliaogoumai"}],"menu":"资料购买管理"},{"child":[{"buttons":["查看","删除"],"menu":"资料发送","menuJump":"列表","tableName":"ziliaofasong"}],"menu":"资料发送管理"},{"child":[{"buttons":["查看"],"menu":"学生积分","menuJump":"列表","tableName":"xueshengjifen"}],"menu":"学生积分管理"},{"child":[{"buttons":["查看"],"menu":"学生积分增加","menuJump":"列表","tableName":"xueshengjifenzengjia"}],"menu":"学生积分增加管理"},{"child":[{"buttons":["查看"],"menu":"学生积分扣减","menuJump":"列表","tableName":"xueshengjifenkoujian"}],"menu":"学生积分扣减管理"},{"child":[{"buttons":["查看","删除"],"menu":"积分兑换","menuJump":"列表","tableName":"jifenduihuan"}],"menu":"积分兑换管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["查看"],"menu":"试卷列表","tableName":"exampaperlist"},{"buttons":["查看","删除"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","购买"],"menu":"付费资料列表","menuJump":"列表","tableName":"fufeiziliao"}],"menu":"付费资料模块"},{"child":[{"buttons":["查看","兑换"],"menu":"积分商品列表","menuJump":"列表","tableName":"jifenshangpin"}],"menu":"积分商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
