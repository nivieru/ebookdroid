package org.ebookdroid.common.settings.definitions;

import static org.ebookdroid.R.string.pref_brautoscandir_defvalue;
import static org.ebookdroid.R.string.pref_brautoscandir_id;
import static org.ebookdroid.R.string.pref_brfiletypes;
import static org.ebookdroid.R.string.pref_brsearchbookquery_id;
import static org.ebookdroid.R.string.pref_cachelocation_defvalue;
import static org.ebookdroid.R.string.pref_cachelocation_id;

import org.ebookdroid.common.settings.base.FileTypeFilterPreferenceDefinition;
import org.ebookdroid.common.settings.types.CacheLocation;

import org.emdev.common.settings.base.EnumPreferenceDefinition;
import org.emdev.common.settings.base.FileListPreferenceDefinition;
import org.emdev.common.settings.base.StringPreferenceDefinition;

public interface LibPreferences {

    /* =============== Browser settings =============== */

    FileListPreferenceDefinition AUTO_SCAN_DIRS = new FileListPreferenceDefinition(pref_brautoscandir_id,
            pref_brautoscandir_defvalue);

    StringPreferenceDefinition SEARCH_BOOK_QUERY = new StringPreferenceDefinition(pref_brsearchbookquery_id, 0);

    FileTypeFilterPreferenceDefinition FILE_TYPE_FILTER = new FileTypeFilterPreferenceDefinition(pref_brfiletypes);

    EnumPreferenceDefinition<CacheLocation> CACHE_LOCATION = new EnumPreferenceDefinition<CacheLocation>(CacheLocation.class, pref_cachelocation_id, pref_cachelocation_defvalue);

}
