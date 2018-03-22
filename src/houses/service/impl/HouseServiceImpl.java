package houses.service.impl;

import houses.dao.HouseDao;
import houses.dao.impl.HouseDaoImpl;
import houses.service.HouseService;

public class HouseServiceImpl implements HouseService {

    private HouseDao houseDao;

    public HouseServiceImpl(HouseDao houseDao) {
        this.houseDao=houseDao;
    }



}
