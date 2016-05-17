
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
object validate extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Don],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(donForm: Form[Don], id_prj: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("EPVN")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""

<h3>Confirmation de mon Don</h3>

 
"""),_display_(Seq[Any](/*10.2*/form(routes.Application.validate())/*10.37*/ {_display_(Seq[Any](format.raw/*10.39*/("""
<input type="hidden" name="project_id" value='"""),_display_(Seq[Any](/*11.48*/id_prj)),format.raw/*11.54*/("""' >
"""),_display_(Seq[Any](/*12.2*/inputText(donForm("montant"), '_label -> "Montant de mon don (en euros)", '_showConstraints -> false))),format.raw/*12.103*/("""
"""),_display_(Seq[Any](/*13.2*/textarea(field = donForm("description"), args = 'rows -> 10, 'cols -> 20))),format.raw/*13.75*/("""
"""),_display_(Seq[Any](/*14.2*/checkbox(donForm("accept"), '_label -> None, '_text -> "Je m'engage a ne pas modifier les informations saisies sur le site de paiement",'_showConstraints -> false))),format.raw/*14.165*/("""	  

<input type="submit" class="btn btn-primary" value="Confirmer mon don">
""")))})),format.raw/*17.2*/("""

""")))})))}
    }
    
    def render(donForm:Form[Don],id_prj:Long): play.api.templates.HtmlFormat.Appendable = apply(donForm,id_prj)
    
    def f:((Form[Don],Long) => play.api.templates.HtmlFormat.Appendable) = (donForm,id_prj) => apply(donForm,id_prj)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/validate.scala.html
                    HASH: afe5a289d7e1584094688e69c84206c3e49797a8
                    MATRIX: 785->1|930->35|960->57|997->60|1017->72|1056->74|1135->118|1179->153|1219->155|1304->204|1332->210|1373->216|1497->317|1535->320|1630->393|1668->396|1854->559|1966->640
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|38->10|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|45->17
                    -- GENERATED --
                */
            