
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
object event extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Event,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(event: Event):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

"""),_display_(Seq[Any](/*3.2*/main("EPVN")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

	<h1>"""),_display_(Seq[Any](/*5.7*/event/*5.12*/.title)),format.raw/*5.18*/("""</h1>
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(event:Event): play.api.templates.HtmlFormat.Appendable = apply(event)
    
    def f:((Event) => play.api.templates.HtmlFormat.Appendable) = (event) => apply(event)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/event.scala.html
                    HASH: e984f600b3421882bc07ec50716cf21137c288f1
                    MATRIX: 773->1|881->15|920->20|940->32|979->34|1023->44|1036->49|1063->55|1101->63
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6
                    -- GENERATED --
                */
            