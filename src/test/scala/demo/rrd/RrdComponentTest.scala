package demo.rrd

import org.scalajs.dom.document
import slinky.web.ReactDOM
import org.scalatest.funsuite.AnyFunSuite
import vision.id.rrd.facade.reactRouter.mod._
import vision.id.rrd.facade.reactRouterDom.components._

class RrdComponentTest extends AnyFunSuite {
  test("Can render a BrowserRouter component") {
    val container = document.createElement("div")
    val aRoute = Route(RouteProps().setPath(""))
    val aBrowserRouter = BrowserRouter("Something", aRoute)

    ReactDOM.render(aBrowserRouter, container)

    assert(container.innerHTML.contains("Something") === true)
  }

}
