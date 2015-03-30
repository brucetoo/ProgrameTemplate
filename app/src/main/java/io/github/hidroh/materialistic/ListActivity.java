package io.github.hidroh.materialistic;

import io.github.hidroh.materialistic.data.ItemManager;

public class ListActivity extends BaseStoriesActivity {

    @Override
    protected String getDefaultTitle() {
        return getString(R.string.title_activity_list);
    }

    @Override
    protected ItemManager.FetchMode getFetchMode() {
        return ItemManager.FetchMode.top;
    }

}
