$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/membership.feature");
formatter.feature({
  "name": "Adding a new membership",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to add a new member",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "name": "Send valid \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Proceed to captcha and click login button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify that user is on the home page",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Üyelerini Ekle bar",
  "keyword": "When "
});
formatter.step({
  "name": "Click Yeni Liste Oluştur bar",
  "keyword": "And "
});
formatter.step({
  "name": "Name the list",
  "keyword": "And "
});
formatter.step({
  "name": "Add new member using add with form",
  "keyword": "And "
});
formatter.step({
  "name": "Verify that new member is seen under recordeds tab",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "berkertoklac@hotmail.com",
        "Bt12449948"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to add a new member",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.LoginStepDef.navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send valid \"berkertoklac@hotmail.com\" and \"Bt12449948\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.Membership_defs.sendValidAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proceed to captcha and click login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.LoginStepDef.proceed_to_captcha_and_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that user is on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.LoginStepDef.verify_that_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Üyelerini Ekle bar",
  "keyword": "When "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.Membership_defs.clickÜyeleriniEkleBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Yeni Liste Oluştur bar",
  "keyword": "And "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.Membership_defs.clickYeniListeOluşturBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Name the list",
  "keyword": "And "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.Membership_defs.nameTheList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add new member using add with form",
  "keyword": "And "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.Membership_defs.addNewMemberUsingAddWithForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that new member is seen under recordeds tab",
  "keyword": "Then "
});
formatter.match({
  "location": "com.euromsgexpress.step_definitions.Membership_defs.verifyThatNewMemberIsSeenUnderRecordedsTab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});