package mars.zhou;

public class BraveKnight implements IKnight {
	private IQuest quest;

	public BraveKnight(IQuest quest) {
		this.quest = quest;
	}
	
	@Override
	public void EmbarkOnQuest(){
		quest.Embark();
	}
}