package org.xtext.example.mydsl.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import iotsuite.parser.Main;

public class CompileVocabularySpec implements IObjectActionDelegate {

	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public CompileVocabularySpec() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {

		String[] args = new String[3];
		args[0] = "compile-vocab-spec";
		args[1] = "C:\\Template\\";

		try {
			Main.main(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
