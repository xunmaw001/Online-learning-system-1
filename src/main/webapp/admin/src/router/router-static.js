import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import xueshengjifen from '@/views/modules/xueshengjifen/list'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import examquestion from '@/views/modules/examquestion/list'
    import storeup from '@/views/modules/storeup/list'
    import xueshengjifenzengjia from '@/views/modules/xueshengjifenzengjia/list'
    import jifenshangpin from '@/views/modules/jifenshangpin/list'
    import fufeiziliao from '@/views/modules/fufeiziliao/list'
    import exampaperlist from '@/views/modules/exampaperlist/list'
    import examrecord from '@/views/modules/examrecord/list'
    import news from '@/views/modules/news/list'
    import discussjifenshangpin from '@/views/modules/discussjifenshangpin/list'
    import discussfufeiziliao from '@/views/modules/discussfufeiziliao/list'
    import jifenduihuan from '@/views/modules/jifenduihuan/list'
    import exampaper from '@/views/modules/exampaper/list'
    import discusskechengxinxi from '@/views/modules/discusskechengxinxi/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import ziliaofasong from '@/views/modules/ziliaofasong/list'
    import forum from '@/views/modules/forum/list'
    import kechengfenlei from '@/views/modules/kechengfenlei/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import xueshengjifenkoujian from '@/views/modules/xueshengjifenkoujian/list'
    import messages from '@/views/modules/messages/list'
    import ziliaogoumai from '@/views/modules/ziliaogoumai/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/xueshengjifen',
        name: '学生积分',
        component: xueshengjifen
      }
          ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/xueshengjifenzengjia',
        name: '学生积分增加',
        component: xueshengjifenzengjia
      }
          ,{
	path: '/jifenshangpin',
        name: '积分商品',
        component: jifenshangpin
      }
          ,{
	path: '/fufeiziliao',
        name: '付费资料',
        component: fufeiziliao
      }
          ,{
	path: '/exampaperlist',
        name: '试卷列表',
        component: exampaperlist
      }
          ,{
	path: '/examrecord',
        name: '考试记录',
        component: examrecord
      }
          ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
          ,{
	path: '/discussjifenshangpin',
        name: '积分商品评论',
        component: discussjifenshangpin
      }
          ,{
	path: '/discussfufeiziliao',
        name: '付费资料评论',
        component: discussfufeiziliao
      }
          ,{
	path: '/jifenduihuan',
        name: '积分兑换',
        component: jifenduihuan
      }
          ,{
	path: '/exampaper',
        name: '试卷管理',
        component: exampaper
      }
          ,{
	path: '/discusskechengxinxi',
        name: '课程信息评论',
        component: discusskechengxinxi
      }
          ,{
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
          ,{
	path: '/ziliaofasong',
        name: '资料发送',
        component: ziliaofasong
      }
          ,{
	path: '/forum',
        name: '解疑论坛',
        component: forum
      }
          ,{
	path: '/kechengfenlei',
        name: '课程分类',
        component: kechengfenlei
      }
          ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
          ,{
	path: '/xueshengjifenkoujian',
        name: '学生积分扣减',
        component: xueshengjifenkoujian
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/ziliaogoumai',
        name: '资料购买',
        component: ziliaogoumai
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
