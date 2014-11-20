package views.retyping

import common.CommonTest
import java.io.File
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import views.retyping.api._

/**
 * @note these tests are basically a copy of unicode test and do not useful per se
 * @note this test is already successful if the code compiles!
 * @author Timm Felden
 */
@RunWith(classOf[JUnitRunner])
class SimpleTest extends CommonTest {

  test("check unicode example") {
    val path = new File("src/test/resources/unicode-reference.sf").toPath()

    val σ = SkillFile.open(path)
  }

  /**
   * views work here, because the test file contains only self-referential instances
   */
  test("check views") {
    val path = new File("src/test/resources/localBasePoolOffset.sf").toPath()

    val σ = SkillFile.open(path)
  }
}
