package com.deltacodex.web.servlet;

import com.deltacodex.web.core.remote.CurrencyConverter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Home")
public class Home extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");

            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();

            InitialContext context = new InitialContext();
            CurrencyConverter converter = (CurrencyConverter) context.lookup("com.deltacodex.web.core.remote.CurrencyConverter");
            double lkr = converter.convertToLKR(1500);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Subscription Success</title>");
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
            out.println("  background-color: #121212;");
            out.println("  color: #e0e0e0;");
            out.println("  padding: 50px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println(".success-box {");
            out.println("  background-color: #1e1e1e;");
            out.println("  padding: 40px;");
            out.println("  border-radius: 12px;");
            out.println("  box-shadow: 0 0 20px rgba(0, 255, 128, 0.15);");
            out.println("  display: inline-block;");
            out.println("  max-width: 500px;");
            out.println("}");
            out.println(".success-box h2 {");
            out.println("  color: #00e676;");
            out.println("  font-size: 28px;");
            out.println("  margin-bottom: 15px;");
            out.println("}");
            out.println(".success-box p {");
            out.println("  font-size: 18px;");
            out.println("  line-height: 1.6;");
            out.println("  color: #cccccc;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='success-box'>");
            out.println("<h2>🎉 Subscribed Successfully!</h2>");
            out.println("<p>Thanks, <strong>" + name + "</strong>!<br>We've added <strong>" + email + "</strong> to our mailing list.</p>");
            out.println("<p>Currency Rate Today <br>LKR to USD <strong>" + lkr + "</strong></p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}

