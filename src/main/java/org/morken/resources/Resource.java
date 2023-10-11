package org.morken.resources;

import org.morken.subjectsystem.System;
import org.morken.subjectsystem.SystemDAO;
import org.morken.subjectsystem.SystemResource;

public class Resource {
    // Hacking away
    protected static final SystemDAO dao = new SystemDAO();
    protected static final SystemResource systemResource = new SystemResource(new System(dao), dao);
}
