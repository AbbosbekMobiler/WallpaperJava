package mobiler.abbosbek.wallpaperjava.listeners;

import mobiler.abbosbek.wallpaperjava.model.SearchApiResponse;

public interface SearchResponseListener {
    void onFetch(SearchApiResponse response,String message);
    void onError(String message);
}
