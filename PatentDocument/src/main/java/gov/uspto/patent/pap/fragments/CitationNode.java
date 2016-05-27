package gov.uspto.patent.pap.fragments;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;

import gov.uspto.parser.dom4j.DOMFragmentReader;
import gov.uspto.patent.model.Citation;
import gov.uspto.patent.model.Claim;

public class CitationNode extends DOMFragmentReader<List<Citation>> {
	private static final String PATENT_PATH = "//subdoc-claims/claim";

	public CitationNode(Document document) {
		super(document);
	}

	@Override
	public List<Citation> read() {
		List<Citation> citations = new ArrayList<Citation>();

		@SuppressWarnings("unchecked")
		List<Node> citeNodes = document.selectNodes(PATENT_PATH);
		for (Node citeNode : citeNodes) {
			
		}

		return citations;
	}


}
