package models

import org.scalatest.{ShouldMatchers, FunSpec}

class ApidocCommentsSpec extends FunSpec with ShouldMatchers {

  it("with only version") {
    ApidocComments("1.0", None).toJavaString should be("""
/**
 * Generated by apidoc - http://www.apidoc.me
 * Service version: 1.0
 */
""".trim)

    ApidocComments("1.0", None).toRubyString should be("""
# Generated by apidoc - http://www.apidoc.me
# Service version: 1.0
""".trim)
  }

}
