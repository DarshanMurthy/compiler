package com.startup.compiler.zip;

import java.util.Iterator;
import java.util.Map;

public class Zip {
    static final int ZIP64_ENDSIG = 0x06064b50;
    static final int LOCHDR = 30; //LOC header size

    static class ZipIterator implements Iterator<Map.Entry>{



        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Map.Entry next() {
            return null;
        }
    }

}
