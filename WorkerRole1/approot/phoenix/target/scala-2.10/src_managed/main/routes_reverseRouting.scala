// @SOURCE:C:/Users/Karim/Desktop/deploy/azure/phoenix/conf/routes
// @HASH:70117884ca44e0798574f336cf9a687b36be7505
// @DATE:Tue May 17 21:57:34 CEST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
class ReverseSession {
    

// @LINE:20
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:19
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:18
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:29
// @LINE:28
class ReverseEvents {
    

// @LINE:28
def listAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events")
}
                                                

// @LINE:29
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:6
class ReverseApplication {
    

// @LINE:22
def confirmDon(id_prj:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "validate/" + implicitly[PathBindable[Long]].unbind("id_prj", id_prj))
}
                                                

// @LINE:15
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:23
def validate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "validate")
}
                                                

// @LINE:16
def newUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:13
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:13
case () if true => Call("GET", _prefix + { _defaultPrefix } + "users")
                                                        
   }
}
                                                
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:26
// @LINE:25
class ReverseProjects {
    

// @LINE:32
def addProject(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "ajoutProjet")
}
                                                

// @LINE:25
def listAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projects")
}
                                                

// @LINE:31
def newProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ajoutProjet")
}
                                                

// @LINE:26
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projects/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          
}
                  


// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
class ReverseSession {
    

// @LINE:20
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Session.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:19
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Session.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:18
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Session.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:28
class ReverseEvents {
    

// @LINE:28
def listAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.listAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
      }
   """
)
                        

// @LINE:29
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:6
class ReverseApplication {
    

// @LINE:22
def confirmDon : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.confirmDon",
   """
      function(id_prj) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id_prj", id_prj)})
      }
   """
)
                        

// @LINE:15
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:23
def validate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
      }
   """
)
                        

// @LINE:16
def newUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:13
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:31
// @LINE:26
// @LINE:25
class ReverseProjects {
    

// @LINE:32
def addProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.addProject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ajoutProjet"})
      }
   """
)
                        

// @LINE:25
def listAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.listAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects"})
      }
   """
)
                        

// @LINE:31
def newProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.newProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajoutProjet"})
      }
   """
)
                        

// @LINE:26
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
class ReverseSession {
    

// @LINE:20
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Session.logout(), HandlerDef(this, "controllers.Session", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:19
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Session.authenticate(), HandlerDef(this, "controllers.Session", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:18
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Session.login(), HandlerDef(this, "controllers.Session", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:29
// @LINE:28
class ReverseEvents {
    

// @LINE:28
def listAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.listAll(), HandlerDef(this, "controllers.Events", "listAll", Seq(), "GET", """""", _prefix + """events""")
)
                      

// @LINE:29
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.show(id), HandlerDef(this, "controllers.Events", "show", Seq(classOf[Long]), "GET", """""", _prefix + """events/$id<[0-9]+>""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:6
class ReverseApplication {
    

// @LINE:22
def confirmDon(id_prj:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.confirmDon(id_prj), HandlerDef(this, "controllers.Application", "confirmDon", Seq(classOf[Long]), "GET", """""", _prefix + """validate/$id_prj<[^/]+>""")
)
                      

// @LINE:15
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:23
def validate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validate(), HandlerDef(this, "controllers.Application", "validate", Seq(), "POST", """""", _prefix + """validate""")
)
                      

// @LINE:16
def newUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newUser(), HandlerDef(this, "controllers.Application", "newUser", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:26
// @LINE:25
class ReverseProjects {
    

// @LINE:32
def addProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.addProject(), HandlerDef(this, "controllers.Projects", "addProject", Seq(), "POST", """""", _prefix + """ajoutProjet""")
)
                      

// @LINE:25
def listAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.listAll(), HandlerDef(this, "controllers.Projects", "listAll", Seq(), "GET", """""", _prefix + """projects""")
)
                      

// @LINE:31
def newProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.newProject(), HandlerDef(this, "controllers.Projects", "newProject", Seq(), "GET", """""", _prefix + """ajoutProjet""")
)
                      

// @LINE:26
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.show(id), HandlerDef(this, "controllers.Projects", "show", Seq(classOf[Long]), "GET", """""", _prefix + """projects/$id<[0-9]+>""")
)
                      
    
}
                          
}
        
    