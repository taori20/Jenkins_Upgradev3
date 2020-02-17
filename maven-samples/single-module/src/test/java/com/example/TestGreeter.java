package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }
  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "Test1";

    assertThat(greeter.greet(someone), containsString(someone));
  }
  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "Test2";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
    @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "Test3";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
//    @Test
//  public void greetShouldIncludeGreetingMessage() {
//    String someone = "Hello, World. Thanks you making me Happy";
//
//    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
//  }
}
