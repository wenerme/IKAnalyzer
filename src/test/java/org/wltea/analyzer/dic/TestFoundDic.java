package org.wltea.analyzer.dic;

import java.io.InputStream;
import org.junit.Test;

public class TestFoundDic
{
    @Test
    public void testDir()
    {
        ClassLoader loader = this.getClass().getClassLoader();
        InputStream mainDic = loader.getResourceAsStream("org.wltea.analyzer.dic/main2012.dic");

        assert mainDic != null;
    }
}
