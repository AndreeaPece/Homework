package controller;

import domain.Cauciuc;
import domain.SearchCauciucResearch;
import service.SearchService;


public class CauciucController {
    private SearchService searchService = new SearchService();

    public Cauciuc handleSearchCauciucResearch(SearchCauciucResearch searchCauciucResearch){
        Cauciuc cauciuc = this.searchService.search(searchCauciucResearch);
        return cauciuc;

    }
}
