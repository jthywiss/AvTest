//
// QuestionViewComponent.java: Class file for WO Component 'QuestionViewComponent'
// Project AvTest
//
// Created by jthywiss on Thu Feb 27 2003
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class QuestionViewComponent extends WOComponent {

        /** @TypeInfo KnowTestQuestion */
        protected EOEnterpriseObject question;

    public QuestionViewComponent(WOContext context) {
        super(context);
    }

}
