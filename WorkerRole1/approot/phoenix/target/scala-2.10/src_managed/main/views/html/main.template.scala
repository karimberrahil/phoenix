
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container">
					<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
						<span class="icon-bar">
						<span class="icon-bar">
						<span class="icon-bar">
					</button>
					<a href=""""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Application.index())),format.raw/*22.42*/("""" class="brand">EPVN</a>
					<div class="nav-collapse collapse">					
						<ul class="nav pull-right">   
							    
								<li>
									<td><a href=""""),_display_(Seq[Any](/*27.24*/routes/*27.30*/.Application.index())),format.raw/*27.50*/("""">Accueil</a></td>
								</li>
								<li>
									<td><a href=""""),_display_(Seq[Any](/*30.24*/routes/*30.30*/.Projects.listAll())),format.raw/*30.49*/("""">Projets</a></td>
								</li>
								<li>
									<td><a href=""""),_display_(Seq[Any](/*33.24*/routes/*33.30*/.Events.listAll())),format.raw/*33.47*/("""">�v�nements</a></td>
								</li>
								<!-- TODO Ce n'est pas ici qu'il faut autoriser l'ajout de projet mais dans le back office -->
								<!-- <li>
									<td><a href=""""),_display_(Seq[Any](/*37.24*/routes/*37.30*/.Projects.newProject())),format.raw/*37.52*/("""">Ajout Projet</a></td>
								</li>   -->
								<li>
									<td><a href=""""),_display_(Seq[Any](/*40.24*/routes/*40.30*/.Application.register())),format.raw/*40.53*/("""">Inscription</a></td>
								</li>
								<li>
							"""),_display_(Seq[Any](/*43.9*/if(session().isEmpty())/*43.32*/ {_display_(Seq[Any](format.raw/*43.34*/(""" 
									<td><a href=""""),_display_(Seq[Any](/*44.24*/routes/*44.30*/.Session.login())),format.raw/*44.46*/("""">Connexion</a></td>
								</li>
							""")))}/*46.10*/else/*46.15*/{_display_(Seq[Any](format.raw/*46.16*/("""
								<li>
									<td><a href=""""),_display_(Seq[Any](/*48.24*/routes/*48.30*/.Session.logout())),format.raw/*48.47*/("""">Deconnexion</a></td>
								</li>
							""")))})),format.raw/*50.9*/("""
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row-fluid">
				<div class="span8">
				</div>
			</div>
			
			"""),_display_(Seq[Any](/*62.5*/content)),format.raw/*62.12*/("""
			
		</div>
	</body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 21:57:34 CEST 2016
                    SOURCE: C:/Users/Karim/Desktop/deploy/azure/phoenix/app/views/main.scala.html
                    HASH: 79660c2802e5505a011ce39c073ac13bec146a4e
                    MATRIX: 778->1|902->31|996->90|1022->95|1198->236|1212->242|1267->276|1365->338|1380->344|1434->376|1496->402|1511->408|1578->453|2018->857|2033->863|2075->883|2272->1044|2287->1050|2329->1070|2437->1142|2452->1148|2493->1167|2601->1239|2616->1245|2655->1262|2875->1446|2890->1452|2934->1474|3053->1557|3068->1563|3113->1586|3209->1647|3241->1670|3281->1672|3343->1698|3358->1704|3396->1720|3460->1766|3473->1771|3512->1772|3587->1811|3602->1817|3641->1834|3719->1881|3927->2054|3956->2061
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|50->22|50->22|50->22|55->27|55->27|55->27|58->30|58->30|58->30|61->33|61->33|61->33|65->37|65->37|65->37|68->40|68->40|68->40|71->43|71->43|71->43|72->44|72->44|72->44|74->46|74->46|74->46|76->48|76->48|76->48|78->50|90->62|90->62
                    -- GENERATED --
                */
            