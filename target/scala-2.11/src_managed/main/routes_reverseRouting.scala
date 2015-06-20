// @SOURCE:C:/Users/Caio/Downloads/ANEL/anelrest/conf/routes
// @HASH:1ccce0af352734519ba193b516c964d171fa7088
// @DATE:Sat Jun 20 10:18:25 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAssets {


// @LINE:22
// @LINE:21
// @LINE:20
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:20
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/assets/")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def decrementa(id:Long, code:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "decrementa/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Integer]].unbind("code", code))
}
                        

// @LINE:14
def incrementa(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "incrementa")
}
                        

// @LINE:8
def removeUsuario(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "remove/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:7
def home(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:10
def renderEdit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:15
def addUsuario(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add/usuario")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "index")
}
                        

// @LINE:13
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAssets {


// @LINE:22
// @LINE:21
// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def decrementa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.decrementa",
   """
      function(id,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "decrementa/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:14
def incrementa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.incrementa",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "incrementa"})
      }
   """
)
                        

// @LINE:8
def removeUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeUsuario",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:7
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def renderEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderEdit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def addUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addUsuario",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add/usuario"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
      }
   """
)
                        

// @LINE:13
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAssets {


// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def decrementa(id:Long, code:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.decrementa(id, code), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "decrementa", Seq(classOf[Long], classOf[Integer]), "GET", """""", _prefix + """decrementa/$id<[^/]+>/$code<[^/]+>""")
)
                      

// @LINE:14
def incrementa(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.incrementa(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "incrementa", Seq(), "POST", """""", _prefix + """incrementa""")
)
                      

// @LINE:8
def removeUsuario(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeUsuario(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeUsuario", Seq(classOf[Long]), "GET", """""", _prefix + """remove/$id<[^/]+>""")
)
                      

// @LINE:7
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:10
def renderEdit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderEdit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderEdit", Seq(classOf[Long]), "GET", """""", _prefix + """edit/$id<[^/]+>""")
)
                      

// @LINE:15
def addUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addUsuario(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUsuario", Seq(), "POST", """""", _prefix + """add/usuario""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """index""")
)
                      

// @LINE:13
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      

}
                          
}
        
    