package service;
import java.io.IOException;

import com.example.Projeto_Demeter.entity.Cart;
import com.example.Projeto_Demeter.entity.Item;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
	@WebServlet("/addToCart")
	public class AddToCartServlet extends HttpServlet {
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String itemName = request.getParameter("itemName");
	        double itemPrice = Double.parseDouble(request.getParameter("itemPrice"));
	        int quantity = Integer.parseInt(request.getParameter("quantity"));

	        Item item = new Item(itemName, itemPrice, quantity);

	        HttpSession session = request.getSession();
	        Cart cart = (Cart) session.getAttribute("cart");
	        if (cart == null) {
	            cart = new Cart();
	            session.setAttribute("cart", cart);
	        }

	        cart.addItem(item);

	        response.sendRedirect("index.jsp"); // Página inicial
	    }
	}


