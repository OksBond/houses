package houses.servlets;

import houses.dao.impl.HouseDaoImpl;
import houses.service.HouseService;
import houses.service.impl.HouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet ("/housesServlet")
public class HousesServlet extends HttpServlet {
    private HouseService houseService=new HouseServiceImpl(new HouseDaoImpl());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
