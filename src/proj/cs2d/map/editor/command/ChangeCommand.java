package proj.cs2d.map.editor.command;

import java.awt.Color;

import proj.cs2d.map.HealthPickup;
import proj.cs2d.map.MapObject;
import proj.cs2d.map.RenderableMapObject;

public class ChangeCommand extends Command {
	private MapObject obj;
	private Change change;
	private Object newValue;
	
	public ChangeCommand(MapObject obj, Change change, Object newValue) {
		this.obj = obj;
		this.change = change;
		this.newValue = newValue;
	}
	
	@Override
	public Command execute() {
		switch (change) {
		case Collidable:
			boolean newColl = (boolean) newValue;
			newValue = obj.isCollidable();
			obj.setCollidable(newColl);
			break;
		case Color:
			Color newColor = (Color) newValue;
			newValue = ((RenderableMapObject)obj).getColor();
			((RenderableMapObject)obj).setColor(newColor);
			break;
		case HealthRestore:
			int healthRestore = (Integer) newValue;
			newValue = ((HealthPickup)obj).getHealthRestoration();
			((HealthPickup)obj).setHealthRestoration(healthRestore);
			break;
		case Cooldown:
			int cooldown = (Integer) newValue;
			newValue = ((HealthPickup)obj).getCooldown();
			((HealthPickup)obj).setCooldown(cooldown);
			break;
		}
		return this;
	}

	@Override
	public Command undo() {
		switch (change) {
		case Collidable:
			boolean newColl = (boolean) newValue;
			newValue = obj.isCollidable();
			obj.setCollidable(newColl);
			break;
		case Color:
			Color newColor = (Color) newValue;
			newValue = ((RenderableMapObject)obj).getColor();
			((RenderableMapObject)obj).setColor(newColor);
			break;
		case HealthRestore:
			int healthRestore = (Integer) newValue;
			newValue = ((HealthPickup)obj).getHealthRestoration();
			((HealthPickup)obj).setHealthRestoration(healthRestore);
			break;
		case Cooldown:
			int cooldown = (Integer) newValue;
			newValue = ((HealthPickup)obj).getCooldown();
			((HealthPickup)obj).setCooldown(cooldown);
			break;
		}
		return this;
	}

}
