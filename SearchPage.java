// Generated by the WebObjects Assistant Thu Feb 27 21:00:16 US/Central 2003

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class SearchPage extends WOComponent {

    /** @TypeInfo KnowTestQuestion */
    protected EOEnterpriseObject knowtestquestion;
    // This WODisplayGroup is initialized from the .woo archive in the component's constructor method
    protected WODisplayGroup knowtestquestionDisplayGroup;

    public SearchPage(WOContext context) {
        super(context);
    }


    public WOComponent selectQuestion()
    {
        knowtestquestionDisplayGroup.setSelectedObject(knowtestquestion);
        return null;
    }
    
}