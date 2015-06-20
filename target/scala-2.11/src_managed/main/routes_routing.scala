// @SOURCE:C:/Users/Caio/Downloads/ANEL/anelrest/conf/routes
// @HASH:1ccce0af352734519ba193b516c964d171fa7088
// @DATE:Sat Jun 20 10:18:25 BRT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index"))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """index"""))
        

// @LINE:7
private[this] lazy val controllers_Application_home1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_home1_invoker = createInvoker(
controllers.Application.home(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_removeUsuario2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_removeUsuario2_invoker = createInvoker(
controllers.Application.removeUsuario(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeUsuario", Seq(classOf[Long]),"GET", """""", Routes.prefix + """remove/$id<[^/]+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_decrementa3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("decrementa/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("code", """[^/]+""",true))))
private[this] lazy val controllers_Application_decrementa3_invoker = createInvoker(
controllers.Application.decrementa(fakeValue[Long], fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "decrementa", Seq(classOf[Long], classOf[Integer]),"GET", """""", Routes.prefix + """decrementa/$id<[^/]+>/$code<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_Application_renderEdit4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_renderEdit4_invoker = createInvoker(
controllers.Application.renderEdit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderEdit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """edit/$id<[^/]+>"""))
        

// @LINE:13
private[this] lazy val controllers_Application_login5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login5_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:14
private[this] lazy val controllers_Application_incrementa6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("incrementa"))))
private[this] lazy val controllers_Application_incrementa6_invoker = createInvoker(
controllers.Application.incrementa(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "incrementa", Nil,"POST", """""", Routes.prefix + """incrementa"""))
        

// @LINE:15
private[this] lazy val controllers_Application_addUsuario7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add/usuario"))))
private[this] lazy val controllers_Application_addUsuario7_invoker = createInvoker(
controllers.Application.addUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUsuario", Nil,"POST", """""", Routes.prefix + """add/usuario"""))
        

// @LINE:20
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:21
private[this] lazy val controllers_Assets_at9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """remove/assets/$file<.+>"""))
        

// @LINE:22
private[this] lazy val controllers_Assets_at10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """add/assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index()"""),("""GET""", prefix,"""controllers.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/$id<[^/]+>""","""controllers.Application.removeUsuario(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """decrementa/$id<[^/]+>/$code<[^/]+>""","""controllers.Application.decrementa(id:Long, code:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/$id<[^/]+>""","""controllers.Application.renderEdit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """incrementa""","""controllers.Application.incrementa()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add/usuario""","""controllers.Application.addUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_home1_route(params) => {
   call { 
        controllers_Application_home1_invoker.call(controllers.Application.home())
   }
}
        

// @LINE:8
case controllers_Application_removeUsuario2_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_removeUsuario2_invoker.call(controllers.Application.removeUsuario(id))
   }
}
        

// @LINE:9
case controllers_Application_decrementa3_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Integer]("code", None)) { (id, code) =>
        controllers_Application_decrementa3_invoker.call(controllers.Application.decrementa(id, code))
   }
}
        

// @LINE:10
case controllers_Application_renderEdit4_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_renderEdit4_invoker.call(controllers.Application.renderEdit(id))
   }
}
        

// @LINE:13
case controllers_Application_login5_route(params) => {
   call { 
        controllers_Application_login5_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:14
case controllers_Application_incrementa6_route(params) => {
   call { 
        controllers_Application_incrementa6_invoker.call(controllers.Application.incrementa())
   }
}
        

// @LINE:15
case controllers_Application_addUsuario7_route(params) => {
   call { 
        controllers_Application_addUsuario7_invoker.call(controllers.Application.addUsuario())
   }
}
        

// @LINE:20
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:21
case controllers_Assets_at9_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:22
case controllers_Assets_at10_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     