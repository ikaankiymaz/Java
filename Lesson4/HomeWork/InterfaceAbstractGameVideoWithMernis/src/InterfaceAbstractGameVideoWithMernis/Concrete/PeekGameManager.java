package InterfaceAbstractGameVideoWithMernis.Concrete;

import InterfaceAbstractGameVideoWithMernis.Abstract.BaseGameManager;
import InterfaceAbstractGameVideoWithMernis.Entities.Game;

public class PeekGameManager extends BaseGameManager{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " has been added.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " has been deleted.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " has been updated..");
	}

}
