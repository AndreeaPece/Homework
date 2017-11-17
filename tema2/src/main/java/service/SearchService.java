package service;

import domain.Cauciuc;
import domain.SearchCauciucResearch;
import service.CauciucService;


public class SearchService {
    private CauciucService cauciucService = new CauciucService();
    public Cauciuc search(SearchCauciucResearch searchCauciucResearch){
        Cauciuc availableCauciuc = null;

        if (searchCauciucResearch != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchCauciucResearch.size);

        }

        return availableCauciuc;
    }


}
