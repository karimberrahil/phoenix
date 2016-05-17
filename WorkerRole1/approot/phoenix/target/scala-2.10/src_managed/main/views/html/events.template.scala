
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
object events extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Event],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(events: List[Event]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(Seq[Any](/*3.2*/main("EPVN")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

	<h1>Les �v�nements</h1>

<div class="container project-container">
  <div class="row">
  """),_display_(Seq[Any](/*9.4*/for(event <- events) yield /*9.24*/ {_display_(Seq[Any](format.raw/*9.26*/("""<!-- Ajouter dans le if: && !Project.isSubProject(project.id) && !Project.isCompleted(project.id)-->
  """),_display_(Seq[Any](/*10.4*/if(event.is_validate && !Event.isFull(event.id))/*10.52*/{_display_(Seq[Any](format.raw/*10.53*/("""
    <div class="card card-block col-lg-3 col-lg-offset-1 col-md-5 col-md-offset-1 col-sm-12 col-xs-12">
	  <h4 class="card-title">"""),_display_(Seq[Any](/*12.28*/event/*12.33*/.title)),format.raw/*12.39*/("""</h4>
	  <img src="image.svg" data-src="image.svg" style="width:100%;height:auto;" alt="Card image cap"/>
      <p class="card-text">
	  		"""),_display_(Seq[Any](/*15.7*/event/*15.12*/.description)),format.raw/*15.24*/("""
	  </p>
	  <div class="row progress">
		  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="0"
		  aria-valuemin="0" aria-valuemax="100" style="width:70%">
			Avancement """),_display_(Seq[Any](/*20.16*/Event/*20.21*/.getAvancement(event.id))),format.raw/*20.45*/("""%
		  </div>
	</div>
      <div class="row">
		<a href=""""),_display_(Seq[Any](/*24.13*/routes/*24.19*/.Events.show(event.id))),format.raw/*24.41*/("""" class="col-lg-4 col-md-4 col-sm-4 col-xs-4 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 btn btn-info">Consulter</a>
		<a href="#" class="col-lg-5 col-md-5 col-sm-5 col-xs-5 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 btn btn-success">Faire un don</a>
	</div>
    </div>
    """)))})),format.raw/*28.6*/("""
    """)))})),format.raw/*29.6*/("""
</div>
</div>
""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(events:List[Event]): play.api.templates.HtmlFormat.Appendable = apply(events)
    
    def f:((List[Event]) => play.api.templates.HtmlFormat.Appendable) = (events) => apply(events)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/events.scala.html
                    HASH: 0b8c4dc358bae918c30f075e083663d88aea9d8f
                    MATRIX: 780->1|895->22|934->27|954->39|993->41|1126->140|1161->160|1200->162|1340->267|1397->315|1436->316|1606->450|1620->455|1648->461|1826->604|1840->609|1874->621|2118->829|2132->834|2178->858|2275->919|2290->925|2334->947|2685->1267|2723->1274|2773->1293
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|43->15|43->15|43->15|48->20|48->20|48->20|52->24|52->24|52->24|56->28|57->29|60->32
                    -- GENERATED --
                */
            