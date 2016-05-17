
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(flash: String, users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("EPVN")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""

	"""),_display_(Seq[Any](/*7.3*/if(flash!=null)/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
		<div class="alert alert-block alert-info">
			"""),_display_(Seq[Any](/*9.5*/flash)),format.raw/*9.10*/("""
		</div>
	""")))})),format.raw/*11.3*/("""
    
    <h1>Bienvenue sur la plateforme de suivi d'EPVN</h1>
    <br>

    <h3>Utilisateurs/Pass pour test la bdd</h3>
    <table class="table table-striped table-bordered">
    	<tbody>
	    	<tr>
	    		<th>username</th>
	    		<th>motDePasse</th>
	    	</tr>
	    	"""),_display_(Seq[Any](/*23.8*/for(user <- users) yield /*23.26*/ {_display_(Seq[Any](format.raw/*23.28*/("""
		    	<tr>
		    		<td>"""),_display_(Seq[Any](/*25.14*/user/*25.18*/.adresseMail)),format.raw/*25.30*/("""</td>
		    		<td>$"""),_display_(Seq[Any](/*26.15*/user/*26.19*/.motDePasse)),format.raw/*26.30*/("""</td>
		    	</tr>
			""")))})),format.raw/*28.5*/("""
    	</tbody>
    </table>

""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(flash:String,users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(flash,users)
    
    def f:((String,List[User]) => play.api.templates.HtmlFormat.Appendable) = (flash,users) => apply(flash,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/index.scala.html
                    HASH: a77fe90fba257848d8be5263271909bd6d678af8
                    MATRIX: 785->1|930->35|960->57|997->60|1017->72|1056->74|1096->80|1119->95|1158->97|1244->149|1270->154|1315->168|1633->451|1667->469|1707->471|1771->499|1784->503|1818->515|1875->536|1888->540|1921->551|1977->576|2042->610
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|39->11|51->23|51->23|51->23|53->25|53->25|53->25|54->26|54->26|54->26|56->28|60->32
                    -- GENERATED --
                */
            