
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
object ajoutProjet extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Project],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projectForm: Form[Project]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("EPVN")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""

	<h1>Ajout d'un Projet</h1>
	
	"""),_display_(Seq[Any](/*9.3*/form(routes.Projects.addProject())/*9.37*/ {_display_(Seq[Any](format.raw/*9.39*/("""
	    """),_display_(Seq[Any](/*10.7*/inputText(projectForm("title"), '_label -> "Nom du projet", '_showConstraints -> false))),format.raw/*10.94*/("""
	    <h1>Description du projet</h1> 
		"""),_display_(Seq[Any](/*12.4*/textarea(field = projectForm(""), args = 'rows -> 10, 'cols -> 20))),format.raw/*12.70*/("""
		<h1>Nom de la partie du projet</h1> 
		"""),_display_(Seq[Any](/*14.4*/inputText(projectForm("title"), '_label -> "Nom du projet", '_showConstraints -> false))),format.raw/*14.91*/("""
		<h1>Montant(en euros)</h1> 
		"""),_display_(Seq[Any](/*16.4*/inputText(projectForm("total_amount"), '_label -> "Montant projet", '_showConstraints -> false))),format.raw/*16.99*/("""
	    <input type="submit" class="btn btn-primary" value="Soumettre le projet">
	""")))})),format.raw/*18.3*/("""
	
		<a href=""""),_display_(Seq[Any](/*20.13*/routes/*20.19*/.Application.index())),format.raw/*20.39*/("""">Accueil</a>
	
""")))})))}
    }
    
    def render(projectForm:Form[Project]): play.api.templates.HtmlFormat.Appendable = apply(projectForm)
    
    def f:((Form[Project]) => play.api.templates.HtmlFormat.Appendable) = (projectForm) => apply(projectForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/ajoutProjet.scala.html
                    HASH: d1eed6af7fde5750be05c2863fd572cf8535b3db
                    MATRIX: 787->1|926->29|956->51|993->54|1013->66|1052->68|1124->106|1166->140|1205->142|1248->150|1357->237|1435->280|1523->346|1603->391|1712->478|1783->514|1900->609|2015->693|2068->710|2083->716|2125->736
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|38->10|38->10|40->12|40->12|42->14|42->14|44->16|44->16|46->18|48->20|48->20|48->20
                    -- GENERATED --
                */
            