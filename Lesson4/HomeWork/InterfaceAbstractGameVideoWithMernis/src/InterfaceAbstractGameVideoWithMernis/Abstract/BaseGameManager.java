package InterfaceAbstractGameVideoWithMernis.Abstract;

import InterfaceAbstractGameVideoWithMernis.Entities.Game;

public abstract class BaseGameManager implements IGameManager{
	
	public abstract void add(Game game);
	
	public abstract void delete(Game game);
	
	public abstract void update(Game game);

}
