
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Session.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(flash: String, loginForm: Form[Session.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("EPVN")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""

	"""),_display_(Seq[Any](/*7.3*/if(flash!=null)/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
		<div class="alert alert-block alert-info">
			"""),_display_(Seq[Any](/*9.5*/flash)),format.raw/*9.10*/("""
		</div>
	""")))})),format.raw/*11.3*/("""

	<h1>Connexion</h1>

	"""),_display_(Seq[Any](/*15.3*/form(routes.Session.authenticate())/*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
		"""),_display_(Seq[Any](/*16.4*/inputText(loginForm("adresseMail"), '_label -> "Email", '_showConstraints -> false))),format.raw/*16.87*/("""
	  	"""),_display_(Seq[Any](/*17.6*/inputPassword(loginForm("motDePasse"), '_label -> "Mot de passe", '_showConstraints -> false))),format.raw/*17.99*/("""
	  	<input type="submit" class="btn btn-primary" value="Connexion">
	""")))})),format.raw/*19.3*/("""

""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(flash:String,loginForm:Form[Session.Login]): play.api.templates.HtmlFormat.Appendable = apply(flash,loginForm)
    
    def f:((String,Form[Session.Login]) => play.api.templates.HtmlFormat.Appendable) = (flash,loginForm) => apply(flash,loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/login.scala.html
                    HASH: e3e4648cbb5a427d5df09eded0e94060da1de952
                    MATRIX: 794->1|952->48|982->70|1019->73|1039->85|1078->87|1118->93|1141->108|1180->110|1266->162|1292->167|1337->181|1401->210|1445->245|1485->247|1525->252|1630->335|1672->342|1787->435|1891->508|1927->513
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|39->11|43->15|43->15|43->15|44->16|44->16|45->17|45->17|47->19|49->21
                    -- GENERATED --
                */
            