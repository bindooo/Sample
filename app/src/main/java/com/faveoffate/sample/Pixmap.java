package com.faveoffate.sample;

import com.faveoffate.sample.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();
    public int getHeight();
    public PixmapFormat getFormat();
    public void dispose();
}
