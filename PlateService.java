package service;

import com.Dao.PlateDao;
import domain.Plate;

import java.util.List;

public class PlateService {
    PlateDao plateDao = new PlateDao();
    public List<Plate> getPlate(){
        return plateDao.getPlate();
    }
}
