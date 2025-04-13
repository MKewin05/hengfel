
/*
* File: module-info.java
* Author: Markó Kevin
* Copyright: 2025, Markó Kevin
* Group: Szoft II-N
* Date: 2025-04-13
* Github: https://github.com/MKewin05/
* Licenc: MIT
*/

module green.weed {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens green.weed to javafx.fxml;

    exports green.weed;
}
