package org.mozilla.javascript.tests;

import org.mozilla.javascript.drivers.RhinoTest;
import org.mozilla.javascript.drivers.ScriptTestsBase;

@RhinoTest(value = "jstests/inc-dec.js")
public class IncDecTest extends ScriptTestsBase {}
