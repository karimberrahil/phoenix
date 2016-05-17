
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("EPVN")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""

	<h1>Inscription</h1>
	
	"""),_display_(Seq[Any](/*9.3*/form(routes.Application.newUser())/*9.37*/ {_display_(Seq[Any](format.raw/*9.39*/("""
		"""),_display_(Seq[Any](/*10.4*/inputText(userForm("adresseMail"), '_label -> "Email", '_showConstraints -> false))),format.raw/*10.86*/("""
	  	"""),_display_(Seq[Any](/*11.6*/inputPassword(userForm("motDePasse"), '_label -> "Mot de passe", '_showConstraints -> false))),format.raw/*11.98*/("""
		"""),_display_(Seq[Any](/*12.4*/inputText(userForm("nom"), '_label -> "Nom", '_showConstraints -> false))),format.raw/*12.76*/("""
	  	"""),_display_(Seq[Any](/*13.6*/inputText(userForm("prenom"), '_label -> "Prenom", '_showConstraints -> false))),format.raw/*13.84*/("""
	  	"""),_display_(Seq[Any](/*14.6*/inputDate(userForm("dateDeNaissance"), '_label -> "Date de naissance", '_showConstraints -> false))),format.raw/*14.104*/("""
	  	"""),_display_(Seq[Any](/*15.6*/inputText(userForm("adresseMaison"), '_label -> "Adresse domicile", '_showConstraints -> false))),format.raw/*15.101*/("""
	  	"""),_display_(Seq[Any](/*16.6*/inputText(userForm("codePostal"), '_label -> "Code postal", '_showConstraints -> false))),format.raw/*16.93*/("""
	  	"""),_display_(Seq[Any](/*17.6*/inputText(userForm("ville"), '_label -> "Ville", '_showConstraints -> false))),format.raw/*17.82*/("""
	  	"""),_display_(Seq[Any](/*18.6*/inputRadioGroup(
          userForm("sexe"),
          options = Seq("M"->"Homme","F"->"Femme"),
          '_label -> "Sexe",
          '_error -> userForm("sexe").error.map(_.withMessage("selectionner le sexe"))))),format.raw/*22.88*/("""
	  	<input type="submit" class="btn btn-primary" value="S'inscrire">
	""")))})),format.raw/*24.3*/("""
		<a href=""""),_display_(Seq[Any](/*25.13*/routes/*25.19*/.Application.index())),format.raw/*25.39*/("""">Accueil</a>
	
""")))})))}
    }
    
    def render(userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/register.scala.html
                    HASH: e760bcba4ee088ccda76a813aaf3c17eb9b826f1
                    MATRIX: 781->1|914->23|944->45|981->48|1001->60|1040->62|1106->94|1148->128|1187->130|1227->135|1331->217|1373->224|1487->316|1527->321|1621->393|1663->400|1763->478|1805->485|1926->583|1968->590|2086->685|2128->692|2237->779|2279->786|2377->862|2419->869|2658->1086|2763->1160|2813->1174|2828->1180|2870->1200
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15|44->16|44->16|45->17|45->17|46->18|50->22|52->24|53->25|53->25|53->25
                    -- GENERATED --
                */
            