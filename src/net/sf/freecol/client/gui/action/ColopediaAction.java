/**
 *  Copyright (C) 2002-2013   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui.action;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import net.sf.freecol.client.FreeColClient;


/**
 * Displays a section of the Colopedia.
 */
public class ColopediaAction extends FreeColAction {

    public static final String id = "colopediaAction.";

    public static enum PanelType {
        TERRAIN, RESOURCES, UNITS, GOODS,
        SKILLS, BUILDINGS, FATHERS, NATIONS,
        NATION_TYPES, CONCEPTS
    }

    private static final int[] mnemonics = new int[] {
        KeyEvent.VK_T,
        KeyEvent.VK_R,
        KeyEvent.VK_U,
        KeyEvent.VK_G,
        KeyEvent.VK_S,
        KeyEvent.VK_B,
        KeyEvent.VK_F,
        KeyEvent.VK_N,
        KeyEvent.VK_A,
        KeyEvent.VK_C
    };


    /**
     * Creates this action.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     * @param panelType The <code>PanelType</code> to use.
     */
    public ColopediaAction(FreeColClient freeColClient, PanelType panelType) {
        super(freeColClient, id + panelType);

        setMnemonic(mnemonics[panelType.ordinal()]);
    }


    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    public void actionPerformed(ActionEvent e) {
        getGUI().showColopediaPanel(getId());
    }
}
