package com.sam_chordas.android.stockhawk.data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;


@Database(version = QuoteDatabase.VERSION)
public class QuoteDatabase {
    private QuoteDatabase() {
    }

    public static final int VERSION = 9;

    @Table(QuoteColumns.class)
    public static final String QUOTES = "quotes";

    @Table(QuoteHistoryColumns.class)
    public static final String H_QUOTES = "HQuotes";

}
