package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTableTag extends TagSupport {

    public int number;
    public String color;
    //setter
    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            //Print the Table
            out.println("<div style = 'color :"+color+" '>");
            out.println("<br>");
            for (int i = 1; i <= 10; i++) {
                out.println((i * number)+"<br>");
            }
            out.println("</div>");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
