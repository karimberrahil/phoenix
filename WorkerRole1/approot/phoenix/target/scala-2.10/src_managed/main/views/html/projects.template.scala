
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
object projects extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Project],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(Seq[Any](/*3.2*/main("EPVN")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

	<h1>Les projets</h1>

<div class="container project-container">
  <div class="row">
  """),_display_(Seq[Any](/*9.4*/for(project <- projects) yield /*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""<!-- Ajouter dans le if: && !Project.isSubProject(project.id) && !Project.isCompleted(project.id)-->
  """),_display_(Seq[Any](/*10.4*/if(project.is_validate && !Project.isSubProject(project.id) && !Project.isCompleted(project.id))/*10.100*/{_display_(Seq[Any](format.raw/*10.101*/("""
    <div class="card card-block col-lg-3 col-lg-offset-1 col-md-5 col-md-offset-1 col-sm-12 col-xs-12">
	  <h4 class="card-title">"""),_display_(Seq[Any](/*12.28*/project/*12.35*/.title)),format.raw/*12.41*/("""</h4>
	  <img src="image.svg" data-src="image.svg" style="width:100%;height:auto;" alt="Card image cap"/>
      <p class="card-text">
	  		"""),_display_(Seq[Any](/*15.7*/project/*15.14*/.description)),format.raw/*15.26*/("""
	  </p>
	  <div class="row progress">
		  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="0"
		  aria-valuemin="0" aria-valuemax="100" style="width:70%">
			Avancement """),_display_(Seq[Any](/*20.16*/Project/*20.23*/.getAvancement(project.id))),format.raw/*20.49*/("""%
		  </div>
	</div>
      <div class="row">
		<a href=""""),_display_(Seq[Any](/*24.13*/routes/*24.19*/.Projects.show(project.id))),format.raw/*24.45*/("""" class="col-lg-4 col-md-4 col-sm-4 col-xs-4 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 btn btn-info">Consulter</a>
		<a href=""""),_display_(Seq[Any](/*25.13*/routes/*25.19*/.Application.confirmDon(project.id))),format.raw/*25.54*/(""""  onclick="project.id.submit()" class="col-lg-5 col-md-5 col-sm-5 col-xs-5 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1 btn btn-success">Faire un don</a>
	</div>
    </div>
    """)))})),format.raw/*28.6*/("""
    """)))})),format.raw/*29.6*/("""
</div>
</div>
""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(projects:List[Project]): play.api.templates.HtmlFormat.Appendable = apply(projects)
    
    def f:((List[Project]) => play.api.templates.HtmlFormat.Appendable) = (projects) => apply(projects)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/projects.scala.html
                    HASH: 6906e5f9d8637c889ba0f5f9d12c2b6e72f53bf4
                    MATRIX: 784->1|903->26|942->31|962->43|1001->45|1131->141|1170->165|1209->167|1349->272|1455->368|1495->369|1665->503|1681->510|1709->516|1887->659|1903->666|1937->678|2181->886|2197->893|2245->919|2342->980|2357->986|2405->1012|2591->1162|2606->1168|2663->1203|2895->1404|2933->1411|2983->1430
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|43->15|43->15|43->15|48->20|48->20|48->20|52->24|52->24|52->24|53->25|53->25|53->25|56->28|57->29|60->32
                    -- GENERATED --
                */
            