// @SOURCE:C:/Users/Caio/Downloads/activator-1.2.10/demic/conf/routes
// @HASH:42c514a1c12490ca29899809eec219df719061c6
// @DATE:Thu Jun 04 13:39:21 BRT 2015


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
private[this] lazy val controllers_Application_decrementa3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("decrementa/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_decrementa3_invoker = createInvoker(
controllers.Application.decrementa(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "decrementa", Seq(classOf[Long]),"GET", """""", Routes.prefix + """decrementa/$id<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_Application_login4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login4_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:13
private[this] lazy val controllers_Application_addUsuario5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add/usuario"))))
private[this] lazy val controllers_Application_addUsuario5_invoker = createInvoker(
controllers.Application.addUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUsuario", Nil,"POST", """""", Routes.prefix + """add/usuario"""))
        

// @LINE:18
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:19
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """remove/assets/$file<.+>"""))
        

// @LINE:20
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """add/assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index()"""),("""GET""", prefix,"""controllers.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/$id<[^/]+>""","""controllers.Application.removeUsuario(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """decrementa/$id<[^/]+>""","""controllers.Application.decrementa(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add/usuario""","""controllers.Application.addUsuario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_decrementa3_invoker.call(controllers.Application.decrementa(id))
   }
}
        

// @LINE:11
case controllers_Application_login4_route(params) => {
   call { 
        controllers_Application_login4_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:13
case controllers_Application_addUsuario5_route(params) => {
   call { 
        controllers_Application_addUsuario5_invoker.call(controllers.Application.addUsuario())
   }
}
        

// @LINE:18
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:19
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:20
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     