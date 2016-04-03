package de.lessvoid.nifty.renderer.opengl.font.jglfont.format.angelcode;

import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.AngelCodeLineProcessors;
import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.line.CharLine;
import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.line.CharsLine;
import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.line.CommonLine;
import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.line.InfoLine;
import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.line.KerningLine;
import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.line.KerningsLine;
import de.lessvoid.nifty.renderer.opengl.font.jglfont.impl.format.angelcode.line.PageLine;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class AngelCodeLineProcessorsTest {
  private AngelCodeLineProcessors lineProcessor = new AngelCodeLineProcessors();

  @Test
  public void testGet() {
    assertTrue(lineProcessor.get("char") instanceof CharLine);
    assertTrue(lineProcessor.get("chars") instanceof CharsLine);
    assertTrue(lineProcessor.get("common") instanceof CommonLine);
    assertTrue(lineProcessor.get("info") instanceof InfoLine);
    assertTrue(lineProcessor.get("kerning") instanceof KerningLine);
    assertTrue(lineProcessor.get("kernings") instanceof KerningsLine);
    assertTrue(lineProcessor.get("page") instanceof PageLine);
    assertNull(lineProcessor.get("unknown"));
  }
}
