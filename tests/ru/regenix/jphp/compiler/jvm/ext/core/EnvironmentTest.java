package ru.regenix.jphp.compiler.jvm.ext.core;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import ru.regenix.jphp.compiler.jvm.JvmCompilerCase;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnvironmentTest extends JvmCompilerCase {

    @Test
    public void testBasic(){
        check("ext/core/Environment_001.php");
        check("ext/core/Environment_002.php");
        check("ext/core/Environment_003.php");
        check("ext/core/Environment_004.php");
    }
}
