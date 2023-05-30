package tags;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class MyTagHandler extends TagSupport{

    @Override
    public int doStartTag() throws JspException {
        try {
//            task of tags
            JspWriter out = pageContext.getOut();
            out.println("<h1>This is my Custom Tag</h1>");
            out.println("<p>This is my Custom Paragraph</p>");
            out.println("<br>");
            out.println(new Date().toString());
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
    
}
