
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
object project extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Project,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(project: Project):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main("EPVN")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

	<h1>"""),_display_(Seq[Any](/*5.7*/project/*5.14*/.title)),format.raw/*5.20*/("""</h1>
	<ul>
	"""),_display_(Seq[Any](/*7.3*/for(project <- Project.findSubProjects(project.id)) yield /*7.54*/{_display_(Seq[Any](format.raw/*7.55*/("""
		<li>"""),_display_(Seq[Any](/*8.8*/project/*8.15*/.title)),format.raw/*8.21*/("""</li>
	""")))})),format.raw/*9.3*/("""	
	</ul>
""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(project:Project): play.api.templates.HtmlFormat.Appendable = apply(project)
    
    def f:((Project) => play.api.templates.HtmlFormat.Appendable) = (project) => apply(project)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/project.scala.html
                    HASH: 6981eaf5e5d9b086b8e8d4ff9c0965cd9f239726
                    MATRIX: 777->1|889->19|928->24|948->36|987->38|1031->48|1046->55|1073->61|1123->77|1189->128|1227->129|1270->138|1285->145|1312->151|1351->160|1394->172
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|37->9|39->11
                    -- GENERATED --
                */
            