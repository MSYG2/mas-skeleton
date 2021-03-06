/**
 *  IMAS base code for the practical work.
 *  Copyright (C) 2014 DEIM - URV
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cat.urv.imas.gui;

import java.awt.Graphics2D;
import cat.urv.imas.map.BuildingCell;
import cat.urv.imas.map.GasStationCell;
import cat.urv.imas.map.HospitalCell;
import cat.urv.imas.map.StreetCell;

/**
 * Enabling draw each kind of cell.
 */
public interface CellVisualizer {
    
    public void updateGraphics(Graphics2D graphics);

    public void drawPrivateVehicle(StreetCell cell);

    public void drawAmbulance(StreetCell cell);

    public void drawFireman(StreetCell cell);

    public void drawHospital(HospitalCell cell);

    public void drawEmptyStreet(StreetCell cell);

    public void drawBuilding(BuildingCell cell);
    
    public void drawGasStation(GasStationCell cell);
}
